package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_422 {
    private final Production73_422 production = new Production73_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}