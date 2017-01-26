package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_81 {
    private final Production96_81 production = new Production96_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}