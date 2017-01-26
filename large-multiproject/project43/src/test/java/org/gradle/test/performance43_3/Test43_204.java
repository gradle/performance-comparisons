package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_204 {
    private final Production43_204 production = new Production43_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}