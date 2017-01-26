package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_192 {
    private final Production72_192 production = new Production72_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}