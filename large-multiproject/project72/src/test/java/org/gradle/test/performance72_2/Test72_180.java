package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_180 {
    private final Production72_180 production = new Production72_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}