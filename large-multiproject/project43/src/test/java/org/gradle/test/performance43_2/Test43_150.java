package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_150 {
    private final Production43_150 production = new Production43_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}