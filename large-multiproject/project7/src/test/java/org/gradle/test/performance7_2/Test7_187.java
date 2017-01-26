package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_187 {
    private final Production7_187 production = new Production7_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}