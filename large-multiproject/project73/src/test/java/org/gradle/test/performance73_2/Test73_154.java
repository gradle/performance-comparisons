package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_154 {
    private final Production73_154 production = new Production73_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}