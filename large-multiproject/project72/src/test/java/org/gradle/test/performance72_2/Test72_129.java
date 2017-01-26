package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_129 {
    private final Production72_129 production = new Production72_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}