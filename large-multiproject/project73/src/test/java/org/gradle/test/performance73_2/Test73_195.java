package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_195 {
    private final Production73_195 production = new Production73_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}