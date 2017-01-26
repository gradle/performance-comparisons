package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_423 {
    private final Production49_423 production = new Production49_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}