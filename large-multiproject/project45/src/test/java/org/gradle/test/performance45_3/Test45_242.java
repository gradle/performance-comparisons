package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_242 {
    private final Production45_242 production = new Production45_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}