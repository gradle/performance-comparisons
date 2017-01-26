package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_109 {
    private final Production43_109 production = new Production43_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}