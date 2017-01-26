package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_3 {
    private final Production73_3 production = new Production73_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}