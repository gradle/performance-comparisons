package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_400 {
    private final Production72_400 production = new Production72_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}