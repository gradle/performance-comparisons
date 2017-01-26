package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_231 {
    private final Production73_231 production = new Production73_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}