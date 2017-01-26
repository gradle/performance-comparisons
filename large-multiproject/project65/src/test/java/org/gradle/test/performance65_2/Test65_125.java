package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_125 {
    private final Production65_125 production = new Production65_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}