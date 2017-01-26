package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_476 {
    private final Production73_476 production = new Production73_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}