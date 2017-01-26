package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_73 {
    private final Production72_73 production = new Production72_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}