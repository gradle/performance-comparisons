package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_303 {
    private final Production43_303 production = new Production43_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}