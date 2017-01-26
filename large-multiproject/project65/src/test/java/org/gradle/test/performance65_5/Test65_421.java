package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_421 {
    private final Production65_421 production = new Production65_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}