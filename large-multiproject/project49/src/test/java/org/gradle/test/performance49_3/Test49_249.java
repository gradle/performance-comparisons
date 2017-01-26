package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_249 {
    private final Production49_249 production = new Production49_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}