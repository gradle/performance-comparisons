package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_206 {
    private final Production72_206 production = new Production72_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}