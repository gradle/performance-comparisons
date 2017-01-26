package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_302 {
    private final Production72_302 production = new Production72_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}