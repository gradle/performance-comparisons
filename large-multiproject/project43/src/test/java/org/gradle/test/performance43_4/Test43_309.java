package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_309 {
    private final Production43_309 production = new Production43_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}