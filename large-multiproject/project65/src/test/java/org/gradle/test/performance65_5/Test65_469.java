package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_469 {
    private final Production65_469 production = new Production65_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}