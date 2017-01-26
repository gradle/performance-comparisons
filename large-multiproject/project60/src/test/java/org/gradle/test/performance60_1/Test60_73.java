package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_73 {
    private final Production60_73 production = new Production60_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}