package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_484 {
    private final Production18_484 production = new Production18_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}