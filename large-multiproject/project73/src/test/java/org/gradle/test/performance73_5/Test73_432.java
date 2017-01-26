package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_432 {
    private final Production73_432 production = new Production73_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}