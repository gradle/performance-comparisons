package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_361 {
    private final Production96_361 production = new Production96_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}