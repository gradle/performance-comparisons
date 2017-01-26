package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_462 {
    private final Production49_462 production = new Production49_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}