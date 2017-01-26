package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_270 {
    private final Production43_270 production = new Production43_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}