package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_143 {
    private final Production45_143 production = new Production45_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}