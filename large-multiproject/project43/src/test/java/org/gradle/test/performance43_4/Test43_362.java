package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_362 {
    private final Production43_362 production = new Production43_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}