package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_315 {
    private final Production43_315 production = new Production43_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}