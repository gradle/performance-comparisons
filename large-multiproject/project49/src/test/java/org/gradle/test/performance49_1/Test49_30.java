package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_30 {
    private final Production49_30 production = new Production49_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}