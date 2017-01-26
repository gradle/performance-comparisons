package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_257 {
    private final Production13_257 production = new Production13_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}