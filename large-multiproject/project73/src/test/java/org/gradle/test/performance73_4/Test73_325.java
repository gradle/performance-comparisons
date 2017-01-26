package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_325 {
    private final Production73_325 production = new Production73_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}