package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_486 {
    private final Production65_486 production = new Production65_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}