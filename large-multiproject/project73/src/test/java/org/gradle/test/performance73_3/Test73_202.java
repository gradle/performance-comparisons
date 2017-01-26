package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_202 {
    private final Production73_202 production = new Production73_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}