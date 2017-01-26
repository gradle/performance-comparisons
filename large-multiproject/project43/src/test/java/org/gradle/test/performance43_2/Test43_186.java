package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_186 {
    private final Production43_186 production = new Production43_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}