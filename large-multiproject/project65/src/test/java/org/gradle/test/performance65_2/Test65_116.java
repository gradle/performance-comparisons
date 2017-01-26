package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_116 {
    private final Production65_116 production = new Production65_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}