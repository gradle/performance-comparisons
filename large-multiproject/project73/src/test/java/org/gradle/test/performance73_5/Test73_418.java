package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_418 {
    private final Production73_418 production = new Production73_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}