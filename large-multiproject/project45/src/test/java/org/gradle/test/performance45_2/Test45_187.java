package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_187 {
    private final Production45_187 production = new Production45_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}