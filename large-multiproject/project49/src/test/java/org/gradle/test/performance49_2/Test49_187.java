package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_187 {
    private final Production49_187 production = new Production49_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}