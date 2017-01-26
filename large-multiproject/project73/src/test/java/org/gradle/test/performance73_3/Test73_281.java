package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_281 {
    private final Production73_281 production = new Production73_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}