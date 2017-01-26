package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_218 {
    private final Production49_218 production = new Production49_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}