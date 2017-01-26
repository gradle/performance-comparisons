package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_251 {
    private final Production45_251 production = new Production45_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}