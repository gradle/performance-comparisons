package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_106 {
    private final Production49_106 production = new Production49_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}