package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_152 {
    private final Production99_152 production = new Production99_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}