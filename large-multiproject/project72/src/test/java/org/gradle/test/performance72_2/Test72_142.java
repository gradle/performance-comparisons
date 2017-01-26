package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_142 {
    private final Production72_142 production = new Production72_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}