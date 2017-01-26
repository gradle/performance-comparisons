package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_73 {
    private final Production18_73 production = new Production18_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}