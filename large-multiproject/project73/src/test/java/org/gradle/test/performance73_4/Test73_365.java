package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_365 {
    private final Production73_365 production = new Production73_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}