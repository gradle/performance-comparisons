package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_73 {
    private final Production15_73 production = new Production15_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}