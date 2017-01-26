package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_321 {
    private final Production49_321 production = new Production49_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}