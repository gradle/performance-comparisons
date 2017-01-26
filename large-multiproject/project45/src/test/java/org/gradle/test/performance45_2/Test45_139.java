package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_139 {
    private final Production45_139 production = new Production45_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}