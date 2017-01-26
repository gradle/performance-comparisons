package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_422 {
    private final Production45_422 production = new Production45_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}