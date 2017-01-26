package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_180 {
    private final Production65_180 production = new Production65_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}