package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_338 {
    private final Production45_338 production = new Production45_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}