package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_73 {
    private final Production27_73 production = new Production27_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}