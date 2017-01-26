package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_471 {
    private final Production73_471 production = new Production73_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}