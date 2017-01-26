package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_147 {
    private final Production43_147 production = new Production43_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}