package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_139 {
    private final Production49_139 production = new Production49_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}