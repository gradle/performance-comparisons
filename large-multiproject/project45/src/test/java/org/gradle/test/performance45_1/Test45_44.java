package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_44 {
    private final Production45_44 production = new Production45_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}