package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_415 {
    private final Production43_415 production = new Production43_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}