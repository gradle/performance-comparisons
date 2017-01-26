package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_58 {
    private final Production42_58 production = new Production42_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}