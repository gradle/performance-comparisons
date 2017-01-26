package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_347 {
    private final Production13_347 production = new Production13_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}