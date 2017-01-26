package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_222 {
    private final Production45_222 production = new Production45_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}