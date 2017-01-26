package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_218 {
    private final Production72_218 production = new Production72_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}