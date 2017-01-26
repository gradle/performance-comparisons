package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_232 {
    private final Production72_232 production = new Production72_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}