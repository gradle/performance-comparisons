package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_261 {
    private final Production65_261 production = new Production65_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}