package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_54 {
    private final Production73_54 production = new Production73_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}