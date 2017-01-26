package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_52 {
    private final Production72_52 production = new Production72_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}