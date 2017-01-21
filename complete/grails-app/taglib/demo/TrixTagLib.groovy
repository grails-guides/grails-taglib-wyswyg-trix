package demo

class TrixTagLib {
    static namespace = "trix"
    static defaultEncodeAs = [taglib:'text']

    def editor = { attrs ->
        def id = attrs.id ?: attrs.name

        out << "<input id=\"${id}\" type=\"hidden\" name=\"${attrs.name}\""
        if ( attrs.value ) {
            out << " value=\"${attrs.value.encodeAsHTML()}\""
        }
        out << " />"
        out << "<trix-editor input=\"${id}\"></trix-editor>"
    }
}
