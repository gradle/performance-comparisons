package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_28 {
    private final Production96_28 production = new Production96_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}