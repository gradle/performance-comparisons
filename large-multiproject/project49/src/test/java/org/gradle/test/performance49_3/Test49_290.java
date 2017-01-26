package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_290 {
    private final Production49_290 production = new Production49_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}