package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_70 {
    private final Production49_70 production = new Production49_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}