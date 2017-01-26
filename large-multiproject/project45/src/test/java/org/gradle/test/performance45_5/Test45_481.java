package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_481 {
    private final Production45_481 production = new Production45_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}