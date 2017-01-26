package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_497 {
    private final Production43_497 production = new Production43_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}