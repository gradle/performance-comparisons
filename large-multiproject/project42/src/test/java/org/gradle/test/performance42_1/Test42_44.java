package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_44 {
    private final Production42_44 production = new Production42_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}