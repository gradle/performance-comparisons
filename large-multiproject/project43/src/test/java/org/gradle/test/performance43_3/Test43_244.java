package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_244 {
    private final Production43_244 production = new Production43_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}