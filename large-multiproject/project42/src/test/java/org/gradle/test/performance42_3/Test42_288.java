package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_288 {
    private final Production42_288 production = new Production42_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}