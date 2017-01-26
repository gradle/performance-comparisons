package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_110 {
    private final Production65_110 production = new Production65_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}