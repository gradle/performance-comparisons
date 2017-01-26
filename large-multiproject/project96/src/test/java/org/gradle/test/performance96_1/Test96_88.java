package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_88 {
    private final Production96_88 production = new Production96_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}