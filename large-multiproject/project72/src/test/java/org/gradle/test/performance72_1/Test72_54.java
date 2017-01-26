package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_54 {
    private final Production72_54 production = new Production72_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}