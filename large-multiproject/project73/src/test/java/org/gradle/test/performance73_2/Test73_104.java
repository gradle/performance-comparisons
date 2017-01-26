package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_104 {
    private final Production73_104 production = new Production73_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}