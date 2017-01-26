package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_114 {
    private final Production73_114 production = new Production73_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}