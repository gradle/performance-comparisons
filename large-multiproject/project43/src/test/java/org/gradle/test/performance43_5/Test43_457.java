package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_457 {
    private final Production43_457 production = new Production43_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}