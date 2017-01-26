package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_343 {
    private final Production65_343 production = new Production65_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}