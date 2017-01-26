package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_190 {
    private final Production73_190 production = new Production73_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}