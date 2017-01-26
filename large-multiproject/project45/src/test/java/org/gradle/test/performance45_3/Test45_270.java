package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_270 {
    private final Production45_270 production = new Production45_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}