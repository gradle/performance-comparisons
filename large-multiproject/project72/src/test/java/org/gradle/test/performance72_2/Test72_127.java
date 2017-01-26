package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_127 {
    private final Production72_127 production = new Production72_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}