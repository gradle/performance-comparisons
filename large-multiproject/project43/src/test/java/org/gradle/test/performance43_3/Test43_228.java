package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_228 {
    private final Production43_228 production = new Production43_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}