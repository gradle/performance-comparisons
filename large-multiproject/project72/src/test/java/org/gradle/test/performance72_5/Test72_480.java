package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_480 {
    private final Production72_480 production = new Production72_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}