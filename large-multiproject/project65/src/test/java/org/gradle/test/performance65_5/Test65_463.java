package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_463 {
    private final Production65_463 production = new Production65_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}