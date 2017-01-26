package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_232 {
    private final Production65_232 production = new Production65_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}