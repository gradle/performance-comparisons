package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_307 {
    private final Production73_307 production = new Production73_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}