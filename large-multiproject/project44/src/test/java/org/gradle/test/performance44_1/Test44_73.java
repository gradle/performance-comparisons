package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_73 {
    private final Production44_73 production = new Production44_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}