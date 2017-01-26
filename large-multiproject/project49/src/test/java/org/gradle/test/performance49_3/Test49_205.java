package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_205 {
    private final Production49_205 production = new Production49_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}