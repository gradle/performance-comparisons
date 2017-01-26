package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_146 {
    private final Production45_146 production = new Production45_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}