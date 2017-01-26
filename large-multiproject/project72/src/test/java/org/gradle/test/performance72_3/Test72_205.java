package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_205 {
    private final Production72_205 production = new Production72_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}