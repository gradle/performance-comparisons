package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_112 {
    private final Production45_112 production = new Production45_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}