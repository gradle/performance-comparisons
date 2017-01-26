package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_51 {
    private final Production96_51 production = new Production96_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}