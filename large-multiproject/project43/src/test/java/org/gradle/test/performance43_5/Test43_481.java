package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_481 {
    private final Production43_481 production = new Production43_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}