package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_333 {
    private final Production73_333 production = new Production73_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}