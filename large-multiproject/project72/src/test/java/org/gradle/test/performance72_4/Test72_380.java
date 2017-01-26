package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_380 {
    private final Production72_380 production = new Production72_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}