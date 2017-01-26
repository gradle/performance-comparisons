package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_323 {
    private final Production79_323 production = new Production79_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}