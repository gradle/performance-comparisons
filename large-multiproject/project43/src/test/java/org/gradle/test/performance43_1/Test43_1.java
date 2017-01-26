package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_1 {
    private final Production43_1 production = new Production43_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}