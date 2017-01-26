package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_462 {
    private final Production73_462 production = new Production73_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}