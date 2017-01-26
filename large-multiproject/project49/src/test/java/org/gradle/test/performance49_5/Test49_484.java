package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_484 {
    private final Production49_484 production = new Production49_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}