package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_142 {
    private final Production65_142 production = new Production65_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}