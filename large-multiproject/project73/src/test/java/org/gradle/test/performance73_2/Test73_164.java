package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_164 {
    private final Production73_164 production = new Production73_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}