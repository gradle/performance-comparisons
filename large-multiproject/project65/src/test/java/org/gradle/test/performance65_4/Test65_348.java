package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_348 {
    private final Production65_348 production = new Production65_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}