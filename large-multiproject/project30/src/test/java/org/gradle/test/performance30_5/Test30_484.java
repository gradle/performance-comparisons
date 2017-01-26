package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_484 {
    private final Production30_484 production = new Production30_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}