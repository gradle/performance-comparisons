package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_252 {
    private final Production72_252 production = new Production72_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}