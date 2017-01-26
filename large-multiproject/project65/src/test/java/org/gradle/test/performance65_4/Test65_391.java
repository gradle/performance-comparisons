package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_391 {
    private final Production65_391 production = new Production65_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}