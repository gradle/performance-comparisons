package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_34 {
    private final Production43_34 production = new Production43_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}