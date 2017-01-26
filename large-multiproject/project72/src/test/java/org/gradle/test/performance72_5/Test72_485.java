package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_485 {
    private final Production72_485 production = new Production72_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}