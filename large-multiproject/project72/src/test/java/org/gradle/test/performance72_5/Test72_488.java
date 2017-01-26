package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_488 {
    private final Production72_488 production = new Production72_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}