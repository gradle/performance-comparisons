package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_12 {
    private final Production96_12 production = new Production96_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}