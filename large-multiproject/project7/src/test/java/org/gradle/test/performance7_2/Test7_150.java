package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_150 {
    private final Production7_150 production = new Production7_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}