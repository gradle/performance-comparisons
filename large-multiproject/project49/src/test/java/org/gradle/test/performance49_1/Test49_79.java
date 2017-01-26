package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_79 {
    private final Production49_79 production = new Production49_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}