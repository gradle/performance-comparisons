package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_484 {
    private final Production96_484 production = new Production96_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}