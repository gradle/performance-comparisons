package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_139 {
    private final Production43_139 production = new Production43_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}