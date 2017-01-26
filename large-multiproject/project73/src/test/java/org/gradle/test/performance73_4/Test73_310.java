package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_310 {
    private final Production73_310 production = new Production73_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}