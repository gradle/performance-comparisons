package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_344 {
    private final Production65_344 production = new Production65_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}