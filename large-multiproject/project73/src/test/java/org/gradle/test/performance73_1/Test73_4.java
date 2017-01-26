package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_4 {
    private final Production73_4 production = new Production73_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}