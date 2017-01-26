package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_53 {
    private final Production73_53 production = new Production73_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}