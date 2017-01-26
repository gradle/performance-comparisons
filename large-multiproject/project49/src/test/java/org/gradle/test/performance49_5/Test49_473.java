package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_473 {
    private final Production49_473 production = new Production49_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}