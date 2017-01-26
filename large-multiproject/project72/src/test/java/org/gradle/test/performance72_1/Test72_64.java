package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_64 {
    private final Production72_64 production = new Production72_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}