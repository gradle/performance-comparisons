package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_90 {
    private final Production43_90 production = new Production43_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}