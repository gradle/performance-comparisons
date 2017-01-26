package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_202 {
    private final Production79_202 production = new Production79_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}