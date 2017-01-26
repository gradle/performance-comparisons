package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_235 {
    private final Production49_235 production = new Production49_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}