package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_316 {
    private final Production65_316 production = new Production65_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}