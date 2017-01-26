package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_358 {
    private final Production73_358 production = new Production73_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}