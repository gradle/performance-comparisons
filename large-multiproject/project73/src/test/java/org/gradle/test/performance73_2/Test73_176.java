package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_176 {
    private final Production73_176 production = new Production73_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}