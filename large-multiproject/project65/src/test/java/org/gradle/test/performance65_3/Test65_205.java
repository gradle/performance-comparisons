package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_205 {
    private final Production65_205 production = new Production65_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}