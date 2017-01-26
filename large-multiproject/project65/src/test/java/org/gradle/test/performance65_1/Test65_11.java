package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_11 {
    private final Production65_11 production = new Production65_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}