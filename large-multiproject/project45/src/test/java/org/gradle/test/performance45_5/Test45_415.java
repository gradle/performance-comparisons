package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_415 {
    private final Production45_415 production = new Production45_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}