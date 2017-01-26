package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_138 {
    private final Production73_138 production = new Production73_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}