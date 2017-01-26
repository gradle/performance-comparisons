package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_68 {
    private final Production45_68 production = new Production45_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}