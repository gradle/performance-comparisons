package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_65 {
    private final Production7_65 production = new Production7_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}