package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_33 {
    private final Production43_33 production = new Production43_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}