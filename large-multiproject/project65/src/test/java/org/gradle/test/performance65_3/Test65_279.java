package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_279 {
    private final Production65_279 production = new Production65_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}