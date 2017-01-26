package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_325 {
    private final Production80_325 production = new Production80_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}