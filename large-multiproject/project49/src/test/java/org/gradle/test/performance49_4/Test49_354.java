package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_354 {
    private final Production49_354 production = new Production49_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}