package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_26 {
    private final Production73_26 production = new Production73_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}