package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_358 {
    private final Production43_358 production = new Production43_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}