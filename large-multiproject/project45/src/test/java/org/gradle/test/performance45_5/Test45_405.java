package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_405 {
    private final Production45_405 production = new Production45_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}