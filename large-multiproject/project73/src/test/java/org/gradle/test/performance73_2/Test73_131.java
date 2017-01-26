package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_131 {
    private final Production73_131 production = new Production73_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}