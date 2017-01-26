package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_242 {
    private final Production43_242 production = new Production43_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}