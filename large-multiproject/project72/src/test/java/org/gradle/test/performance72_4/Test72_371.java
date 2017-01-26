package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_371 {
    private final Production72_371 production = new Production72_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}