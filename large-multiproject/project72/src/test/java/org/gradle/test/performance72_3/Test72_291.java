package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_291 {
    private final Production72_291 production = new Production72_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}