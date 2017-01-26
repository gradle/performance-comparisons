package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_210 {
    private final Production72_210 production = new Production72_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}