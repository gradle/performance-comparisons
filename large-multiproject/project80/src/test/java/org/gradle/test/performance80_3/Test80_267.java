package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_267 {
    private final Production80_267 production = new Production80_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}