package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_108 {
    private final Production65_108 production = new Production65_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}