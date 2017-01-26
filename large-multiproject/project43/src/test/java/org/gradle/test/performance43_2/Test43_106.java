package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_106 {
    private final Production43_106 production = new Production43_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}