package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_214 {
    private final Production73_214 production = new Production73_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}