package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_492 {
    private final Production72_492 production = new Production72_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}