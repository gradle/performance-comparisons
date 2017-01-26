package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_217 {
    private final Production72_217 production = new Production72_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}