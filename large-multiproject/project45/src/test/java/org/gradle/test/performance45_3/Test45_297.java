package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_297 {
    private final Production45_297 production = new Production45_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}