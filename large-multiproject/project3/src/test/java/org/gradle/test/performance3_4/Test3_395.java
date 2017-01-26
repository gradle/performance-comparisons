package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_395 {
    private final Production3_395 production = new Production3_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}