package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_25 {
    private final Production73_25 production = new Production73_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}