package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_171 {
    private final Production73_171 production = new Production73_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}