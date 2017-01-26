package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_289 {
    private final Production73_289 production = new Production73_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}