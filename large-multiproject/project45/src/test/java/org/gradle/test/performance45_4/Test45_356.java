package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_356 {
    private final Production45_356 production = new Production45_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}