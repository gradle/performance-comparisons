package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_499 {
    private final Production72_499 production = new Production72_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}