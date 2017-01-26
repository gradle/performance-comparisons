package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_399 {
    private final Production65_399 production = new Production65_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}