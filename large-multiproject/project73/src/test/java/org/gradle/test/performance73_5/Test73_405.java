package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_405 {
    private final Production73_405 production = new Production73_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}