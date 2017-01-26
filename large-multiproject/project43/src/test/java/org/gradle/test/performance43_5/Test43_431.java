package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_431 {
    private final Production43_431 production = new Production43_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}