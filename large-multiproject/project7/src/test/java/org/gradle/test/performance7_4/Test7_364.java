package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_364 {
    private final Production7_364 production = new Production7_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}