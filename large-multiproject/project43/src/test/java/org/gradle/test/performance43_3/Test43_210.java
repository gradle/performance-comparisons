package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_210 {
    private final Production43_210 production = new Production43_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}