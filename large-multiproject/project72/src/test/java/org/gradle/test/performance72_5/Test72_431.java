package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_431 {
    private final Production72_431 production = new Production72_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}