package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_437 {
    private final Production43_437 production = new Production43_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}