package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_376 {
    private final Production65_376 production = new Production65_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}