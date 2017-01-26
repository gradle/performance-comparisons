package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_458 {
    private final Production73_458 production = new Production73_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}