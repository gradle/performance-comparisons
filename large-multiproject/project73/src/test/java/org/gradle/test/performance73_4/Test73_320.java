package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_320 {
    private final Production73_320 production = new Production73_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}