package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_297 {
    private final Production79_297 production = new Production79_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}