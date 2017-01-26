package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_403 {
    private final Production72_403 production = new Production72_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}