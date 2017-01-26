package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_465 {
    private final Production72_465 production = new Production72_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}