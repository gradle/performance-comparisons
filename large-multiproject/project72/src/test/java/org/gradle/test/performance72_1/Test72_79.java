package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_79 {
    private final Production72_79 production = new Production72_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}