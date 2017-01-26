package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_386 {
    private final Production45_386 production = new Production45_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}