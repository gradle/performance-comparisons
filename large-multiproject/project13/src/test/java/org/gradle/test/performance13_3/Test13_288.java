package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_288 {
    private final Production13_288 production = new Production13_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}