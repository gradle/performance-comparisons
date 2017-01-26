package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_73 {
    private final Production1_73 production = new Production1_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}