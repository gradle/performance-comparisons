package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_483 {
    private final Production65_483 production = new Production65_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}