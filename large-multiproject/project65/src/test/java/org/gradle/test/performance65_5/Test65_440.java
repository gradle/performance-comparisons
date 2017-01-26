package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_440 {
    private final Production65_440 production = new Production65_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}