package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_402 {
    private final Production65_402 production = new Production65_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}