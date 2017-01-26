package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_338 {
    private final Production13_338 production = new Production13_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}