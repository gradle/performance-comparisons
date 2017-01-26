package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_8 {
    private final Production73_8 production = new Production73_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}