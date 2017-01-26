package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_303 {
    private final Production45_303 production = new Production45_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}