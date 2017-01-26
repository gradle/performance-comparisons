package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_438 {
    private final Production65_438 production = new Production65_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}