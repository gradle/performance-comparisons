package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_418 {
    private final Production45_418 production = new Production45_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}