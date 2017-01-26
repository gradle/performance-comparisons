package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_114 {
    private final Production49_114 production = new Production49_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}