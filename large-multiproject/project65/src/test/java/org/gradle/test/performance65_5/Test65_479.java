package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_479 {
    private final Production65_479 production = new Production65_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}