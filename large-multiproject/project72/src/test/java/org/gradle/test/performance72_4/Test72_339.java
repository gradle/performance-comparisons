package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_339 {
    private final Production72_339 production = new Production72_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}