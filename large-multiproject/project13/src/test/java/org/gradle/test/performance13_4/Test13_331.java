package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_331 {
    private final Production13_331 production = new Production13_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}