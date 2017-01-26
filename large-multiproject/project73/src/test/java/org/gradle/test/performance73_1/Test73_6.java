package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_6 {
    private final Production73_6 production = new Production73_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}