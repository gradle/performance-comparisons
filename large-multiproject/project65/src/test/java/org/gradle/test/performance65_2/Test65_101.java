package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_101 {
    private final Production65_101 production = new Production65_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}