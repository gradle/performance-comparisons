package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_187 {
    private final Production43_187 production = new Production43_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}