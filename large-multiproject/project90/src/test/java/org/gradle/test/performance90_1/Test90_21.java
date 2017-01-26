package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_21 {
    private final Production90_21 production = new Production90_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}