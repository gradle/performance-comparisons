package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_132 {
    private final Production65_132 production = new Production65_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}