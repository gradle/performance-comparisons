package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_313 {
    private final Production43_313 production = new Production43_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}