package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_179 {
    private final Production65_179 production = new Production65_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}