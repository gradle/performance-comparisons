package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_224 {
    private final Production72_224 production = new Production72_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}