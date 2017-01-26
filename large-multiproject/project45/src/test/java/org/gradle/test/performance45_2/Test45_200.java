package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_200 {
    private final Production45_200 production = new Production45_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}