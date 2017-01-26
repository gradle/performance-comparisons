package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_329 {
    private final Production43_329 production = new Production43_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}