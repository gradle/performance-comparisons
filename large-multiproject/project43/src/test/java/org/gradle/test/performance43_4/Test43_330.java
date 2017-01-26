package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_330 {
    private final Production43_330 production = new Production43_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}