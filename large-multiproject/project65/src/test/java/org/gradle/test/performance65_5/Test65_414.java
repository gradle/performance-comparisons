package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_414 {
    private final Production65_414 production = new Production65_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}