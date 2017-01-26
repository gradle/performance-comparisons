package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_388 {
    private final Production42_388 production = new Production42_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}