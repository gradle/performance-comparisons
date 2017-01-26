package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_488 {
    private final Production45_488 production = new Production45_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}