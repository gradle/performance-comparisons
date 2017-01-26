package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_246 {
    private final Production43_246 production = new Production43_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}