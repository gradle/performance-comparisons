package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_175 {
    private final Production73_175 production = new Production73_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}