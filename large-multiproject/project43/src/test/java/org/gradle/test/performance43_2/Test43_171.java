package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_171 {
    private final Production43_171 production = new Production43_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}