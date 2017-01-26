package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_350 {
    private final Production73_350 production = new Production73_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}