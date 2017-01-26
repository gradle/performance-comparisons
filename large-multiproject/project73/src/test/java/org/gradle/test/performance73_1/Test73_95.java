package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_95 {
    private final Production73_95 production = new Production73_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}