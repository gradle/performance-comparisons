package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_36 {
    private final Production73_36 production = new Production73_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}