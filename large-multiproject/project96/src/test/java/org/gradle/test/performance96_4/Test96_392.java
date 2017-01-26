package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_392 {
    private final Production96_392 production = new Production96_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}