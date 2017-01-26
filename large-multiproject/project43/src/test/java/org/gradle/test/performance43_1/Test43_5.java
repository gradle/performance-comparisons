package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_5 {
    private final Production43_5 production = new Production43_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}