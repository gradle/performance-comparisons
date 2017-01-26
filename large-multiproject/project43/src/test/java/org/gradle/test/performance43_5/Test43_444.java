package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_444 {
    private final Production43_444 production = new Production43_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}