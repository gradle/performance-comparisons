package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_147 {
    private final Production73_147 production = new Production73_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}