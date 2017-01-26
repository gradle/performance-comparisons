package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_75 {
    private final Production42_75 production = new Production42_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}