package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_72 {
    private final Production42_72 production = new Production42_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}