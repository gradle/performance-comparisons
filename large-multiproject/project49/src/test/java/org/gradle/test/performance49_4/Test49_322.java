package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_322 {
    private final Production49_322 production = new Production49_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}