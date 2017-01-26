package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_310 {
    private final Production43_310 production = new Production43_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}