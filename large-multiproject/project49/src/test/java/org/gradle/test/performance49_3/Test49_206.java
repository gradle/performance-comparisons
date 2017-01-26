package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_206 {
    private final Production49_206 production = new Production49_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}