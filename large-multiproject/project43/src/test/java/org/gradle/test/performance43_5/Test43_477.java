package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_477 {
    private final Production43_477 production = new Production43_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}