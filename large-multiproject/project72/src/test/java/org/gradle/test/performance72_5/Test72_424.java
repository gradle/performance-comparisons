package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_424 {
    private final Production72_424 production = new Production72_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}