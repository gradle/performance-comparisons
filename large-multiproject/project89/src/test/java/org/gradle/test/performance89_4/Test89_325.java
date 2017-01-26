package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_325 {
    private final Production89_325 production = new Production89_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}