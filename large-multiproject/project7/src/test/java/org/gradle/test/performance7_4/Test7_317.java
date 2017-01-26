package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_317 {
    private final Production7_317 production = new Production7_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}