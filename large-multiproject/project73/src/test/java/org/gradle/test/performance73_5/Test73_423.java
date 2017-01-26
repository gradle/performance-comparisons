package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_423 {
    private final Production73_423 production = new Production73_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}