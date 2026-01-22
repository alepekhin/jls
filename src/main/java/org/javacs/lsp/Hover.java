package org.javacs.lsp;

import java.util.List;

public class Hover {
    public Object contents;
    public Range range;

    public Hover() {}

    public Hover(List<MarkedString> contents) {
        this.contents = contents;
    }

    public Hover(MarkupContent contents) {
        this.contents = contents;
    }

    public Hover(List<MarkedString> contents, Range range) {
        this.contents = contents;
        this.range = range;
    }
}
