package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_26 {
    private final Production43_26 production = new Production43_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}