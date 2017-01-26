package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_18 {
    private final Production73_18 production = new Production73_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}