package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_323 {
    private final Production43_323 production = new Production43_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}