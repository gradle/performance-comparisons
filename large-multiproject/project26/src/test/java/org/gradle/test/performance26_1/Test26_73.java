package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_73 {
    private final Production26_73 production = new Production26_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}