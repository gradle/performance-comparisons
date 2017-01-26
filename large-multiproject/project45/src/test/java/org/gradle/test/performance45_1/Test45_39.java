package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_39 {
    private final Production45_39 production = new Production45_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}