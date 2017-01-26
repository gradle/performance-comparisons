package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_61 {
    private final Production43_61 production = new Production43_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}