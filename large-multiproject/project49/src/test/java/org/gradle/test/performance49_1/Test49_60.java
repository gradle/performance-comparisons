package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_60 {
    private final Production49_60 production = new Production49_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}