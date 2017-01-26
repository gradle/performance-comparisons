package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_347 {
    private final Production80_347 production = new Production80_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}