package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_38 {
    private final Production42_38 production = new Production42_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}