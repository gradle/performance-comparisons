package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_115 {
    private final Production65_115 production = new Production65_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}