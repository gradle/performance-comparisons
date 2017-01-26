package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_243 {
    private final Production73_243 production = new Production73_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}