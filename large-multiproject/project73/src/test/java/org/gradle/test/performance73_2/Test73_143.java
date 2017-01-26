package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_143 {
    private final Production73_143 production = new Production73_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}