package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_479 {
    private final Production72_479 production = new Production72_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}