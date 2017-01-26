package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_176 {
    private final Production72_176 production = new Production72_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}