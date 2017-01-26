package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_227 {
    private final Production73_227 production = new Production73_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}