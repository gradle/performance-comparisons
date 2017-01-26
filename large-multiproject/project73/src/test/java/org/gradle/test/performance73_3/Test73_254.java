package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_254 {
    private final Production73_254 production = new Production73_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}