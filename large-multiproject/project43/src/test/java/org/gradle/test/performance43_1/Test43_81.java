package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_81 {
    private final Production43_81 production = new Production43_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}