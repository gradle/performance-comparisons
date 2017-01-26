package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_265 {
    private final Production43_265 production = new Production43_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}