package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_266 {
    private final Production45_266 production = new Production45_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}