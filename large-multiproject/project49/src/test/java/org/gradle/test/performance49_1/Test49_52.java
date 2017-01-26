package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_52 {
    private final Production49_52 production = new Production49_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}