package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_10 {
    private final Production73_10 production = new Production73_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}