package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_324 {
    private final Production96_324 production = new Production96_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}