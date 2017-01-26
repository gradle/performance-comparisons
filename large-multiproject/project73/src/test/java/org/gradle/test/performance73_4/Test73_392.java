package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_392 {
    private final Production73_392 production = new Production73_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}