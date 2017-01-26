package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_47 {
    private final Production73_47 production = new Production73_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}