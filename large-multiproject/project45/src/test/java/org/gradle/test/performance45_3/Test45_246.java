package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_246 {
    private final Production45_246 production = new Production45_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}