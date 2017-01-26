package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_252 {
    private final Production45_252 production = new Production45_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}