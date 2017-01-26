package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_395 {
    private final Production72_395 production = new Production72_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}