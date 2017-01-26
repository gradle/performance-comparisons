package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_261 {
    private final Production72_261 production = new Production72_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}