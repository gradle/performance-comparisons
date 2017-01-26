package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_455 {
    private final Production72_455 production = new Production72_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}