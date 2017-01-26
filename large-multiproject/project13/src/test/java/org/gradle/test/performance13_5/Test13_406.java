package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_406 {
    private final Production13_406 production = new Production13_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}