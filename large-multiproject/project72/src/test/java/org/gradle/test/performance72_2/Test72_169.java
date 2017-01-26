package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_169 {
    private final Production72_169 production = new Production72_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}