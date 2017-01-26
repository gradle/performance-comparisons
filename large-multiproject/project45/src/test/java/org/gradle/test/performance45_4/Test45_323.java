package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_323 {
    private final Production45_323 production = new Production45_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}