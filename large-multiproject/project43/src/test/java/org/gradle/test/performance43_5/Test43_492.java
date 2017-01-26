package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_492 {
    private final Production43_492 production = new Production43_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}