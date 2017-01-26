package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_471 {
    private final Production45_471 production = new Production45_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}