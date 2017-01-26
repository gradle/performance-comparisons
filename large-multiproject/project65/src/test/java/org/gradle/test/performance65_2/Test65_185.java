package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_185 {
    private final Production65_185 production = new Production65_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}