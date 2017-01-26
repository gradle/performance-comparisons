package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_134 {
    private final Production43_134 production = new Production43_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}