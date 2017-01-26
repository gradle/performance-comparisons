package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_254 {
    private final Production43_254 production = new Production43_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}