package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_170 {
    private final Production65_170 production = new Production65_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}