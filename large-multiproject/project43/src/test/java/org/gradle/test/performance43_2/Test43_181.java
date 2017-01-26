package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_181 {
    private final Production43_181 production = new Production43_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}