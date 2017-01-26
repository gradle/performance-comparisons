package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_87 {
    private final Production43_87 production = new Production43_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}