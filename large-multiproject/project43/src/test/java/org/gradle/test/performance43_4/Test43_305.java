package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_305 {
    private final Production43_305 production = new Production43_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}