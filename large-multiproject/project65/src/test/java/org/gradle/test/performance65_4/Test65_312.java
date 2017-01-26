package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_312 {
    private final Production65_312 production = new Production65_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}