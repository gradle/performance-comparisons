package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_100 {
    private final Production45_100 production = new Production45_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}