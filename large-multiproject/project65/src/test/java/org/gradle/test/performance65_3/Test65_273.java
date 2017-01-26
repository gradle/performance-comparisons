package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_273 {
    private final Production65_273 production = new Production65_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}