package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_349 {
    private final Production72_349 production = new Production72_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}