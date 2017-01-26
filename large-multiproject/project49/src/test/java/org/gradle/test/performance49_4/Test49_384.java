package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_384 {
    private final Production49_384 production = new Production49_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}