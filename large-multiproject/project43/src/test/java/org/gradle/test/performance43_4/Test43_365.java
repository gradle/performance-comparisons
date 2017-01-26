package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_365 {
    private final Production43_365 production = new Production43_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}