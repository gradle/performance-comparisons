package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_466 {
    private final Production73_466 production = new Production73_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}