package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_247 {
    private final Production49_247 production = new Production49_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}