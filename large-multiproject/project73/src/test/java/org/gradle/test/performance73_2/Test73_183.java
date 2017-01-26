package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_183 {
    private final Production73_183 production = new Production73_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}