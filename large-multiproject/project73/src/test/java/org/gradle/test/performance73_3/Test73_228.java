package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_228 {
    private final Production73_228 production = new Production73_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}