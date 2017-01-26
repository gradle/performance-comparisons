package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_192 {
    private final Production73_192 production = new Production73_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}