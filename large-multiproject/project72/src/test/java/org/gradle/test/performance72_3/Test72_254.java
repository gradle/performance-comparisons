package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_254 {
    private final Production72_254 production = new Production72_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}