package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_500 {
    private final Production73_500 production = new Production73_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}