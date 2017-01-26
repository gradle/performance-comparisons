package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_172 {
    private final Production80_172 production = new Production80_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}