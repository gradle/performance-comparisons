package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_87 {
    private final Production73_87 production = new Production73_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}