package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_294 {
    private final Production73_294 production = new Production73_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}