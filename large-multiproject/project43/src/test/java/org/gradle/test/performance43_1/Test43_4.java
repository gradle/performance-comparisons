package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_4 {
    private final Production43_4 production = new Production43_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}