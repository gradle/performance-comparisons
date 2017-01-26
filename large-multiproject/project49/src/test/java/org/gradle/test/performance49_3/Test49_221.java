package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_221 {
    private final Production49_221 production = new Production49_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}