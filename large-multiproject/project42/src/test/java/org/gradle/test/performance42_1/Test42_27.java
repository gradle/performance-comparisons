package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_27 {
    private final Production42_27 production = new Production42_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}