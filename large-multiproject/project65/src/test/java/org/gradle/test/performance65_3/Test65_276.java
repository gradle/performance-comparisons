package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_276 {
    private final Production65_276 production = new Production65_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}