package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_93 {
    private final Production43_93 production = new Production43_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}