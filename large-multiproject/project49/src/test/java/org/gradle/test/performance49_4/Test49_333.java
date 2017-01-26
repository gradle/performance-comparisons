package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_333 {
    private final Production49_333 production = new Production49_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}