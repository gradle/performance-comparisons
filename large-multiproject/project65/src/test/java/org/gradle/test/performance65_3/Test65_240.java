package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_240 {
    private final Production65_240 production = new Production65_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}