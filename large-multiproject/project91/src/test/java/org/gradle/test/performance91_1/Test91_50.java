package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_50 {
    private final Production91_50 production = new Production91_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}