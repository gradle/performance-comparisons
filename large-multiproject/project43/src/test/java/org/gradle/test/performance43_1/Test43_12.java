package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_12 {
    private final Production43_12 production = new Production43_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}