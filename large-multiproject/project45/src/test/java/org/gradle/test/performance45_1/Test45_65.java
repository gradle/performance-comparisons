package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_65 {
    private final Production45_65 production = new Production45_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}