package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_151 {
    private final Production1_151 production = new Production1_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}