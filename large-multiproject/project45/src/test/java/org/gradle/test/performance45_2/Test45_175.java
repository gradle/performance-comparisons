package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_175 {
    private final Production45_175 production = new Production45_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}