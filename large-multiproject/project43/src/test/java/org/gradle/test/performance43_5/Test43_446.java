package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_446 {
    private final Production43_446 production = new Production43_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}