package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_281 {
    private final Production45_281 production = new Production45_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}