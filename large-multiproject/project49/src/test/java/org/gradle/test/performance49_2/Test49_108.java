package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_108 {
    private final Production49_108 production = new Production49_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}