package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_441 {
    private final Production72_441 production = new Production72_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}