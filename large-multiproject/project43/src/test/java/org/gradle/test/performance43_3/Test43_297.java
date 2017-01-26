package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_297 {
    private final Production43_297 production = new Production43_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}