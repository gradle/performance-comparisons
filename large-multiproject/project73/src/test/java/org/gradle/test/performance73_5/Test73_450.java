package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_450 {
    private final Production73_450 production = new Production73_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}