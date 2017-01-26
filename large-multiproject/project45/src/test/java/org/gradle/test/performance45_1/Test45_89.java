package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_89 {
    private final Production45_89 production = new Production45_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}