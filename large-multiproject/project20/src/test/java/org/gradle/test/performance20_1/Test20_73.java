package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_73 {
    private final Production20_73 production = new Production20_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}