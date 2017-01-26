package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_145 {
    private final Production43_145 production = new Production43_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}