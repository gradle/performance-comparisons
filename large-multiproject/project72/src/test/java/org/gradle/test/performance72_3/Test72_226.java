package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_226 {
    private final Production72_226 production = new Production72_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}