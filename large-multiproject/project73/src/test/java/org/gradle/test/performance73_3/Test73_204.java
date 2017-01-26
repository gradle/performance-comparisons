package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_204 {
    private final Production73_204 production = new Production73_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}