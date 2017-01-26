package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_247 {
    private final Production73_247 production = new Production73_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}