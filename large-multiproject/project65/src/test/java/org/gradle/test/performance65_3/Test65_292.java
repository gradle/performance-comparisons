package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_292 {
    private final Production65_292 production = new Production65_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}