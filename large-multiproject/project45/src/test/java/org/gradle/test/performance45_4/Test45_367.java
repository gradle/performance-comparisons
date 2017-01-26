package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_367 {
    private final Production45_367 production = new Production45_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}