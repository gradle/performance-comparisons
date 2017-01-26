package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_156 {
    private final Production7_156 production = new Production7_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}