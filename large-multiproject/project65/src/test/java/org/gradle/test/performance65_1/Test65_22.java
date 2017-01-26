package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_22 {
    private final Production65_22 production = new Production65_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}