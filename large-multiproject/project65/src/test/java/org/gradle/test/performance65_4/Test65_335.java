package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_335 {
    private final Production65_335 production = new Production65_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}