package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_34 {
    private final Production73_34 production = new Production73_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}