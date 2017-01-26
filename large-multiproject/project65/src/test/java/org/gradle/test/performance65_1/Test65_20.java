package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_20 {
    private final Production65_20 production = new Production65_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}