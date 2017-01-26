package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_372 {
    private final Production65_372 production = new Production65_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}