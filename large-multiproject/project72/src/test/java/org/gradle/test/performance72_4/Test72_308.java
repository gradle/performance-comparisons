package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_308 {
    private final Production72_308 production = new Production72_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}