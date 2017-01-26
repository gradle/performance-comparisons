package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_466 {
    private final Production45_466 production = new Production45_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}