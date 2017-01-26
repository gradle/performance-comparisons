package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_286 {
    private final Production73_286 production = new Production73_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}