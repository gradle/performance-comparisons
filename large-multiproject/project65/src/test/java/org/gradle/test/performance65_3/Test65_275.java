package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_275 {
    private final Production65_275 production = new Production65_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}