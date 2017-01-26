package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_206 {
    private final Production65_206 production = new Production65_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}