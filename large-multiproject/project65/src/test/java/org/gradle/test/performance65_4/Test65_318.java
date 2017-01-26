package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_318 {
    private final Production65_318 production = new Production65_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}