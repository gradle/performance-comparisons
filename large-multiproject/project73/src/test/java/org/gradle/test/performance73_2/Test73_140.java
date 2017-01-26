package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_140 {
    private final Production73_140 production = new Production73_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}