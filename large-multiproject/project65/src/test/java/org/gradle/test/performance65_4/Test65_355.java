package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_355 {
    private final Production65_355 production = new Production65_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}