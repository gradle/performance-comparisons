package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_216 {
    private final Production43_216 production = new Production43_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}