package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_375 {
    private final Production65_375 production = new Production65_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}