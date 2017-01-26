package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_392 {
    private final Production42_392 production = new Production42_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}