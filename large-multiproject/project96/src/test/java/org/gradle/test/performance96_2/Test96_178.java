package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_178 {
    private final Production96_178 production = new Production96_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}