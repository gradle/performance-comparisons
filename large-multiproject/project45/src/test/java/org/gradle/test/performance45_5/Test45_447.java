package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_447 {
    private final Production45_447 production = new Production45_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}