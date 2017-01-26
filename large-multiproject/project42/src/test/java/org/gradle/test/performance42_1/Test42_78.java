package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_78 {
    private final Production42_78 production = new Production42_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}