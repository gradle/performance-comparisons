package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_403 {
    private final Production49_403 production = new Production49_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}