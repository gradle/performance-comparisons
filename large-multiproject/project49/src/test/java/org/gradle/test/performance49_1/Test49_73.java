package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_73 {
    private final Production49_73 production = new Production49_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}