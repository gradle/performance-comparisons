package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_49 {
    private final Production16_49 production = new Production16_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}