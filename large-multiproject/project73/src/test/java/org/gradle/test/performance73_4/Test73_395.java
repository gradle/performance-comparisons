package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_395 {
    private final Production73_395 production = new Production73_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}