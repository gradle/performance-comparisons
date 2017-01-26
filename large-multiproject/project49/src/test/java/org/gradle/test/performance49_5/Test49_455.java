package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_455 {
    private final Production49_455 production = new Production49_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}