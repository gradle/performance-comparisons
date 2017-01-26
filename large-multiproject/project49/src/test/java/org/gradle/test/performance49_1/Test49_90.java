package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_90 {
    private final Production49_90 production = new Production49_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}