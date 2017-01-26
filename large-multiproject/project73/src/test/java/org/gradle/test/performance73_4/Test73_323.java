package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_323 {
    private final Production73_323 production = new Production73_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}