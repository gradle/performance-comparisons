package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_405 {
    private final Production72_405 production = new Production72_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}