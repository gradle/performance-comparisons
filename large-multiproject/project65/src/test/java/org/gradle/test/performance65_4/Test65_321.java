package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_321 {
    private final Production65_321 production = new Production65_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}