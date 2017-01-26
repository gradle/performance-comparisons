package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_59 {
    private final Production73_59 production = new Production73_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}