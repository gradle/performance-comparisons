package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_80 {
    private final Production42_80 production = new Production42_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}