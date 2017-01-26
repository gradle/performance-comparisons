package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_112 {
    private final Production73_112 production = new Production73_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}