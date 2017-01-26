package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_450 {
    private final Production43_450 production = new Production43_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}