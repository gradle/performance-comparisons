package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_294 {
    private final Production79_294 production = new Production79_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}