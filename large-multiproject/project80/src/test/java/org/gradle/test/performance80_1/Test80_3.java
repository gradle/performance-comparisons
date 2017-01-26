package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_3 {
    private final Production80_3 production = new Production80_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}