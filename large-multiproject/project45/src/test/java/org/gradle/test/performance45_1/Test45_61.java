package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_61 {
    private final Production45_61 production = new Production45_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}