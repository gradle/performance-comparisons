package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_14 {
    private final Production73_14 production = new Production73_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}