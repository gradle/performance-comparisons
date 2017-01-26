package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_295 {
    private final Production49_295 production = new Production49_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}