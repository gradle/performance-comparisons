package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_42 {
    private final Production43_42 production = new Production43_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}