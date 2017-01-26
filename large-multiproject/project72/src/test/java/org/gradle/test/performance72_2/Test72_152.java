package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_152 {
    private final Production72_152 production = new Production72_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}