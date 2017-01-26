package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_52 {
    private final Production73_52 production = new Production73_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}