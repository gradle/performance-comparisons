package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_424 {
    private final Production43_424 production = new Production43_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}