package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_327 {
    private final Production65_327 production = new Production65_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}