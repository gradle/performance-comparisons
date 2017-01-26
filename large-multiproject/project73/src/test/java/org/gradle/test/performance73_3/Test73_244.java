package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_244 {
    private final Production73_244 production = new Production73_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}