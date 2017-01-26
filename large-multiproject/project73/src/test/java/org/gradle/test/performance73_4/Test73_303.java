package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_303 {
    private final Production73_303 production = new Production73_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}