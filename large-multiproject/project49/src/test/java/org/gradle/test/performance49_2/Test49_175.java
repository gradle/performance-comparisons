package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_175 {
    private final Production49_175 production = new Production49_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}