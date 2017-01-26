package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_422 {
    private final Production43_422 production = new Production43_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}