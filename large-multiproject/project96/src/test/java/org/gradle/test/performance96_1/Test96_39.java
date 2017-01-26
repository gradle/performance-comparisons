package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_39 {
    private final Production96_39 production = new Production96_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}