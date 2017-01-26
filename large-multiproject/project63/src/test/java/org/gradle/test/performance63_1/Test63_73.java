package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_73 {
    private final Production63_73 production = new Production63_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}