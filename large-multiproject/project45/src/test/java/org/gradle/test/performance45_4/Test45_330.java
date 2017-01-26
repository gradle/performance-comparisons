package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_330 {
    private final Production45_330 production = new Production45_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}