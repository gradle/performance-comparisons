package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_138 {
    private final Production45_138 production = new Production45_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}