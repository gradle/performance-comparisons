package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_64 {
    private final Production49_64 production = new Production49_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}