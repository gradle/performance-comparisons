package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_247 {
    private final Production72_247 production = new Production72_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}