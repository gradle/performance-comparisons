package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_222 {
    private final Production43_222 production = new Production43_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}