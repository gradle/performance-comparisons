package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_362 {
    private final Production45_362 production = new Production45_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}