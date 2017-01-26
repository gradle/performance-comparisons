package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_347 {
    private final Production16_347 production = new Production16_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}