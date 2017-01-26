package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_76 {
    private final Production45_76 production = new Production45_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}