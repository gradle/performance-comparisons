package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_73 {
    private final Production38_73 production = new Production38_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}