package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_430 {
    private final Production65_430 production = new Production65_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}