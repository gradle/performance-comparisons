package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_250 {
    private final Production65_250 production = new Production65_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}