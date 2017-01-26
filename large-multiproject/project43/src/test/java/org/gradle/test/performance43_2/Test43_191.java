package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_191 {
    private final Production43_191 production = new Production43_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}