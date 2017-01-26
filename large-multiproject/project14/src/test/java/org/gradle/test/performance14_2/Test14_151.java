package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_151 {
    private final Production14_151 production = new Production14_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}