package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_477 {
    private final Production73_477 production = new Production73_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}