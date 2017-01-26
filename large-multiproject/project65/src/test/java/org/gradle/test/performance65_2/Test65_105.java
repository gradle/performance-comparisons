package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_105 {
    private final Production65_105 production = new Production65_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}