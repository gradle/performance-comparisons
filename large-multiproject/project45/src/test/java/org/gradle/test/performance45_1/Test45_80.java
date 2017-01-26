package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_80 {
    private final Production45_80 production = new Production45_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}