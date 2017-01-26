package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_388 {
    private final Production73_388 production = new Production73_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}