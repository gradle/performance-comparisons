package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_105 {
    private final Production49_105 production = new Production49_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}