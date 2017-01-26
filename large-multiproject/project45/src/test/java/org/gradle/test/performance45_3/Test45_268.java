package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_268 {
    private final Production45_268 production = new Production45_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}