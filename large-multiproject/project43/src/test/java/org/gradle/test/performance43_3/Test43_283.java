package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_283 {
    private final Production43_283 production = new Production43_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}