package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_238 {
    private final Production45_238 production = new Production45_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}