package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_484 {
    private final Production20_484 production = new Production20_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}