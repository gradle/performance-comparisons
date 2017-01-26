package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_473 {
    private final Production65_473 production = new Production65_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}