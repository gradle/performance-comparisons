package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_193 {
    private final Production72_193 production = new Production72_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}