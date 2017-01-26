package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_452 {
    private final Production65_452 production = new Production65_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}