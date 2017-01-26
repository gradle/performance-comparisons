package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_305 {
    private final Production73_305 production = new Production73_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}