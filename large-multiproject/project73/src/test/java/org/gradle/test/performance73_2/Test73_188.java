package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_188 {
    private final Production73_188 production = new Production73_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}