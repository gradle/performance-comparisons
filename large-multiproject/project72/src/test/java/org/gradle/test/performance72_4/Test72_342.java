package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_342 {
    private final Production72_342 production = new Production72_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}