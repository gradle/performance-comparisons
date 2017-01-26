package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_297 {
    private final Production73_297 production = new Production73_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}