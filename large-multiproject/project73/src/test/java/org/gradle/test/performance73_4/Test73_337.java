package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_337 {
    private final Production73_337 production = new Production73_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}