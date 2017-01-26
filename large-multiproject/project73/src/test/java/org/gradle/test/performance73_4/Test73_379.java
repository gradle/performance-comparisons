package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_379 {
    private final Production73_379 production = new Production73_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}