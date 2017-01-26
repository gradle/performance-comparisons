package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_255 {
    private final Production96_255 production = new Production96_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}