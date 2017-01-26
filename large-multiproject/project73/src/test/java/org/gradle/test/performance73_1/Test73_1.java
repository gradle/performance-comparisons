package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_1 {
    private final Production73_1 production = new Production73_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}