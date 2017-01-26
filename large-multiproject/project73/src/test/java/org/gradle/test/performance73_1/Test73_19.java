package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_19 {
    private final Production73_19 production = new Production73_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}