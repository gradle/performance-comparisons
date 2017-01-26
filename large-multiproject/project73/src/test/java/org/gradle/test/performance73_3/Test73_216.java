package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_216 {
    private final Production73_216 production = new Production73_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}