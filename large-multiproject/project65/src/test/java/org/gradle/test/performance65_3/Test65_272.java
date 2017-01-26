package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_272 {
    private final Production65_272 production = new Production65_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}