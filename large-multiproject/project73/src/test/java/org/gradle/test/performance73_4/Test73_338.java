package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_338 {
    private final Production73_338 production = new Production73_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}