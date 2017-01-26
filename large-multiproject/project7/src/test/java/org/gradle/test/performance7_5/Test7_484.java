package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_484 {
    private final Production7_484 production = new Production7_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}