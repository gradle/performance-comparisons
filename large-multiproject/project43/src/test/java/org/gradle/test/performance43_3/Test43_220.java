package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_220 {
    private final Production43_220 production = new Production43_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}