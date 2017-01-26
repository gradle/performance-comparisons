package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_451 {
    private final Production11_451 production = new Production11_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}