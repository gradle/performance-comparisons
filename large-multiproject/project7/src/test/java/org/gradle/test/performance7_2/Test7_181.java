package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_181 {
    private final Production7_181 production = new Production7_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}