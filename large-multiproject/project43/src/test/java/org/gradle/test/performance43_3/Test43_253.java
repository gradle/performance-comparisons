package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_253 {
    private final Production43_253 production = new Production43_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}