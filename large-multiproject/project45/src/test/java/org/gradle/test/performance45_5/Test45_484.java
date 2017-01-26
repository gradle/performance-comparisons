package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_484 {
    private final Production45_484 production = new Production45_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}