package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_396 {
    private final Production45_396 production = new Production45_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}