package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_288 {
    private final Production20_288 production = new Production20_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}