package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_170 {
    private final Production72_170 production = new Production72_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}