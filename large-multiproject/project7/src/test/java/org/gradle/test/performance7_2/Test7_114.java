package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_114 {
    private final Production7_114 production = new Production7_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}