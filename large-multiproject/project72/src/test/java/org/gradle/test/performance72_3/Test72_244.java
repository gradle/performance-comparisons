package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_244 {
    private final Production72_244 production = new Production72_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}