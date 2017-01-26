package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_10 {
    private final Production45_10 production = new Production45_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}