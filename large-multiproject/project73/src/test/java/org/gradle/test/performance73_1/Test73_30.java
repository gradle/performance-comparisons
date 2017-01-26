package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_30 {
    private final Production73_30 production = new Production73_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}