package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_51 {
    private final Production73_51 production = new Production73_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}