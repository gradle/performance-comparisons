package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_253 {
    private final Production73_253 production = new Production73_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}