package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_435 {
    private final Production43_435 production = new Production43_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}