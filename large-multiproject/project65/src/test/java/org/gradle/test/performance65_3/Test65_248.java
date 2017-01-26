package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_248 {
    private final Production65_248 production = new Production65_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}