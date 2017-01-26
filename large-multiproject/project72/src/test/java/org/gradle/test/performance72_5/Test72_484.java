package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_484 {
    private final Production72_484 production = new Production72_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}