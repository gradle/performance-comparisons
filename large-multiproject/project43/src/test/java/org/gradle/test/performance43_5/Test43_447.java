package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_447 {
    private final Production43_447 production = new Production43_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}