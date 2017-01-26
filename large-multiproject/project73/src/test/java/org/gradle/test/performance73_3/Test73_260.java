package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_260 {
    private final Production73_260 production = new Production73_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}