package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_31 {
    private final Production73_31 production = new Production73_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}