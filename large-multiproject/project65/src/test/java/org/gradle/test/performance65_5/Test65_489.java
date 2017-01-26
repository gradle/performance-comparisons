package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_489 {
    private final Production65_489 production = new Production65_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}