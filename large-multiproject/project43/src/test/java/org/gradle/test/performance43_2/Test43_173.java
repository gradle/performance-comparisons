package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_173 {
    private final Production43_173 production = new Production43_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}