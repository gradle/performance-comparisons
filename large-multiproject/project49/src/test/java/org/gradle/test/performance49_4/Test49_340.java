package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_340 {
    private final Production49_340 production = new Production49_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}