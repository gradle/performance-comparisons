package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_324 {
    private final Production72_324 production = new Production72_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}