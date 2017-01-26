package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_53 {
    private final Production43_53 production = new Production43_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}