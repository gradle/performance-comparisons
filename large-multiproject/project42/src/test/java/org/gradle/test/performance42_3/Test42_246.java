package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_246 {
    private final Production42_246 production = new Production42_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}