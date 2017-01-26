package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_57 {
    private final Production49_57 production = new Production49_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}