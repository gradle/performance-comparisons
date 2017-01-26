package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_63 {
    private final Production73_63 production = new Production73_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}