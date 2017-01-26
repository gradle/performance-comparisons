package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_489 {
    private final Production49_489 production = new Production49_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}