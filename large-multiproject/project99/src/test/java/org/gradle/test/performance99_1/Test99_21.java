package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_21 {
    private final Production99_21 production = new Production99_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}