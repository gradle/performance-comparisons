package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_288 {
    private final Production30_288 production = new Production30_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}