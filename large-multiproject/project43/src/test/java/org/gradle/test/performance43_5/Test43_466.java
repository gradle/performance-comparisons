package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_466 {
    private final Production43_466 production = new Production43_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}