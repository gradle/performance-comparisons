package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_73 {
    private final Production69_73 production = new Production69_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}