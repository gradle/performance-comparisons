package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_104 {
    private final Production43_104 production = new Production43_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}