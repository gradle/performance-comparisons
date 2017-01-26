package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_289 {
    private final Production43_289 production = new Production43_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}