package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_411 {
    private final Production87_411 production = new Production87_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}