package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_247 {
    private final Production65_247 production = new Production65_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}