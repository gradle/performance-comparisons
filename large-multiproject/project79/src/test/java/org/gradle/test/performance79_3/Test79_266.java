package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_266 {
    private final Production79_266 production = new Production79_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}