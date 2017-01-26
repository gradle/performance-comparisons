package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_73 {
    private final Production45_73 production = new Production45_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}