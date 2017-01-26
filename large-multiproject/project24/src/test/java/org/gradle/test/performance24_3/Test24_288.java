package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_288 {
    private final Production24_288 production = new Production24_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}