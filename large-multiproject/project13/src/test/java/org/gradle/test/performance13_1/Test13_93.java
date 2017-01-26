package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_93 {
    private final Production13_93 production = new Production13_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}