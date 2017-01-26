package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_188 {
    private final Production43_188 production = new Production43_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}