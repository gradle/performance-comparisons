package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_38 {
    private final Production45_38 production = new Production45_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}