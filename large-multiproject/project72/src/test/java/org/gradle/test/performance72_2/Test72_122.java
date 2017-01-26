package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_122 {
    private final Production72_122 production = new Production72_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}