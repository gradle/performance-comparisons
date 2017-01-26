package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_106 {
    private final Production73_106 production = new Production73_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}