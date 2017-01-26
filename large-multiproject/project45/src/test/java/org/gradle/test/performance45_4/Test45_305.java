package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_305 {
    private final Production45_305 production = new Production45_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}