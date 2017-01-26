package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_84 {
    private final Production73_84 production = new Production73_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}