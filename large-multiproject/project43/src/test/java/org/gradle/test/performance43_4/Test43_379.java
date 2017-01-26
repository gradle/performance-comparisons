package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_379 {
    private final Production43_379 production = new Production43_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}