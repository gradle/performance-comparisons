package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_51 {
    private final Production43_51 production = new Production43_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}