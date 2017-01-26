package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_387 {
    private final Production65_387 production = new Production65_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}