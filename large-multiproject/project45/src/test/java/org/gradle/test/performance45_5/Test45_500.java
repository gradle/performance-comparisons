package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_500 {
    private final Production45_500 production = new Production45_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}