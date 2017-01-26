package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_146 {
    private final Production73_146 production = new Production73_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}