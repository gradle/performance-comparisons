package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_33 {
    private final Production73_33 production = new Production73_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}