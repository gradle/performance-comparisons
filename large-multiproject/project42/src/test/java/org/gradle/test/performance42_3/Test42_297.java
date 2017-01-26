package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_297 {
    private final Production42_297 production = new Production42_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}