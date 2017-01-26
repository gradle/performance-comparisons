package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_99 {
    private final Production42_99 production = new Production42_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}