package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_86 {
    private final Production72_86 production = new Production72_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}