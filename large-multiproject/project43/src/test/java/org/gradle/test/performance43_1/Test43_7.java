package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_7 {
    private final Production43_7 production = new Production43_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}