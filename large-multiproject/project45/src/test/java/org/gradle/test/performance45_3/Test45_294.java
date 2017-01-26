package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_294 {
    private final Production45_294 production = new Production45_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}