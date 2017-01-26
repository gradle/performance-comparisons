package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_418 {
    private final Production43_418 production = new Production43_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}