package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_242 {
    private final Production73_242 production = new Production73_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}