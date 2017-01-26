package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_235 {
    private final Production73_235 production = new Production73_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}