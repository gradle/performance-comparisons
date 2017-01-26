package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_212 {
    private final Production79_212 production = new Production79_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}