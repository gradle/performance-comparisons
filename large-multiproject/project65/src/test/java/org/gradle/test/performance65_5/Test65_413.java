package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_413 {
    private final Production65_413 production = new Production65_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}