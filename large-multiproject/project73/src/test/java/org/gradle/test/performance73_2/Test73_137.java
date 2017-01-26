package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_137 {
    private final Production73_137 production = new Production73_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}