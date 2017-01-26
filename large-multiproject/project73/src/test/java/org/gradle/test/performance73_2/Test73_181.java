package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_181 {
    private final Production73_181 production = new Production73_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}