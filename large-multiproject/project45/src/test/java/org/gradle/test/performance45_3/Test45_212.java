package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_212 {
    private final Production45_212 production = new Production45_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}