package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_175 {
    private final Production43_175 production = new Production43_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}