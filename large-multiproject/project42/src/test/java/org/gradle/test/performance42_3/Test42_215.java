package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_215 {
    private final Production42_215 production = new Production42_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}