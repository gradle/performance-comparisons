package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_2 {
    private final Production73_2 production = new Production73_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}