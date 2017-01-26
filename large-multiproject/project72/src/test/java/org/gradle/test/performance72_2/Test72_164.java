package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_164 {
    private final Production72_164 production = new Production72_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}