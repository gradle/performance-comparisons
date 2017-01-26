package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_42 {
    private final Production45_42 production = new Production45_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}