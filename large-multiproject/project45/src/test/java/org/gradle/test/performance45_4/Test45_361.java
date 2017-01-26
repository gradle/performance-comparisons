package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_361 {
    private final Production45_361 production = new Production45_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}