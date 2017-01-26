package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_16 {
    private final Production72_16 production = new Production72_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}