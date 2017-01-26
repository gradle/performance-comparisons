package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_492 {
    private final Production73_492 production = new Production73_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}