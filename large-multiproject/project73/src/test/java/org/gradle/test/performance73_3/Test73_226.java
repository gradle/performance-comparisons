package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_226 {
    private final Production73_226 production = new Production73_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}