package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_486 {
    private final Production49_486 production = new Production49_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}