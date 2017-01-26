package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_46 {
    private final Production43_46 production = new Production43_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}