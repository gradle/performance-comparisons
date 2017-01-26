package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_202 {
    private final Production45_202 production = new Production45_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}