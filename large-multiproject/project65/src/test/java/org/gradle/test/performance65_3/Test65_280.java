package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_280 {
    private final Production65_280 production = new Production65_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}