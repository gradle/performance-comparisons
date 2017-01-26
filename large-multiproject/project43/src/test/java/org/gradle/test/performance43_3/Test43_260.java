package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_260 {
    private final Production43_260 production = new Production43_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}