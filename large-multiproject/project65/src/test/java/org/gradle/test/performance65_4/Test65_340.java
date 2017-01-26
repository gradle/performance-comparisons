package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_340 {
    private final Production65_340 production = new Production65_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}