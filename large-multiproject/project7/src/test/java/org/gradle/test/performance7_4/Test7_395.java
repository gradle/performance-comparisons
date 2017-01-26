package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_395 {
    private final Production7_395 production = new Production7_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}