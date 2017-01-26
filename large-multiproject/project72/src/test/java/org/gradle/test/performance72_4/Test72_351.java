package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_351 {
    private final Production72_351 production = new Production72_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}