package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_92 {
    private final Production43_92 production = new Production43_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}