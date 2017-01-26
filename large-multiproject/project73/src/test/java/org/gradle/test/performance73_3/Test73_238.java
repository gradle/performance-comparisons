package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_238 {
    private final Production73_238 production = new Production73_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}