package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_331 {
    private final Production45_331 production = new Production45_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}