package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_407 {
    private final Production65_407 production = new Production65_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}