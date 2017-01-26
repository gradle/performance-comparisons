package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_309 {
    private final Production45_309 production = new Production45_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}