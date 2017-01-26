package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_401 {
    private final Production72_401 production = new Production72_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}