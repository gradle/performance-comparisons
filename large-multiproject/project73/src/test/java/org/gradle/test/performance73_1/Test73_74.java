package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_74 {
    private final Production73_74 production = new Production73_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}