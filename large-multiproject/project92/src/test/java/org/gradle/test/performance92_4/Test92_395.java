package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_395 {
    private final Production92_395 production = new Production92_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}