package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_429 {
    private final Production65_429 production = new Production65_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}