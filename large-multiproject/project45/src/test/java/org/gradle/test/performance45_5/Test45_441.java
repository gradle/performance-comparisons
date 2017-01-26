package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_441 {
    private final Production45_441 production = new Production45_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}