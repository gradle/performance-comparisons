package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_209 {
    private final Production13_209 production = new Production13_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}