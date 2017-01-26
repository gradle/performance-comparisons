package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_118 {
    private final Production65_118 production = new Production65_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}