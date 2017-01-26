package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_156 {
    private final Production73_156 production = new Production73_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}