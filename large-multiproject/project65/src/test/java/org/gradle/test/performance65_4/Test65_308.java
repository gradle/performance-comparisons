package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_308 {
    private final Production65_308 production = new Production65_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}