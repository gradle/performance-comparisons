package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_73 {
    private final Production73_73 production = new Production73_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}