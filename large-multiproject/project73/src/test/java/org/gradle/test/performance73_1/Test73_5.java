package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_5 {
    private final Production73_5 production = new Production73_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}