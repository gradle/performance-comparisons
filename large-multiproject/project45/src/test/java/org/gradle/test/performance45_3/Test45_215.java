package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_215 {
    private final Production45_215 production = new Production45_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}