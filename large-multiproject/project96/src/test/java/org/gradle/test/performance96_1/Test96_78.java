package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_78 {
    private final Production96_78 production = new Production96_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}