package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_283 {
    private final Production73_283 production = new Production73_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}