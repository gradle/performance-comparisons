package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_340 {
    private final Production72_340 production = new Production72_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}