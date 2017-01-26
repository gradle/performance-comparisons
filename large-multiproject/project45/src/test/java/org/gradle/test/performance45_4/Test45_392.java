package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_392 {
    private final Production45_392 production = new Production45_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}