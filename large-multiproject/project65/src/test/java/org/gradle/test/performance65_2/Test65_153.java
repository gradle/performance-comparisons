package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_153 {
    private final Production65_153 production = new Production65_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}