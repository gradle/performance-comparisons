package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_288 {
    private final Production45_288 production = new Production45_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}