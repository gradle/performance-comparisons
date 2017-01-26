package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_35 {
    private final Production73_35 production = new Production73_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}