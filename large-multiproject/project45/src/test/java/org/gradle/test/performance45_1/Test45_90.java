package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_90 {
    private final Production45_90 production = new Production45_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}