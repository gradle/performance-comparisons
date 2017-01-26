package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_252 {
    private final Production73_252 production = new Production73_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}